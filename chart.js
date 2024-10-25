const DATA_COUNT = 7;
const labels = ['Monday','Tuesday','Wednesday','Thursday','Friday','Saturday','Sunday',];

const data = {
    labels: labels,
    datasets: [
        {
            label: 'Lack of Sleep',
            data: [3,4,6,18,25,50,9],
            borderColor: 'rgba(255, 0, 0, 1)',
            backgroundColor: 'rgba(255, 0, 0, 0.2)',
        },
        {
            label: 'Normal Sleep',
            data: [1,11,7,8,38,24,19],
            borderColor: 'rgba(0, 255, 0, 1)',
            backgroundColor: 'rgba(0, 255, 0, 0.2)',
        },
  
    ]
};

const config = {
    type: 'line',
    data: data,
    options: {
        responsive: true,
        plugins: {
            title: {
                display: true,
                
            }
        },
        scales: {
            y: {
                suggestedMin: 30,
                suggestedMax: 50,
            }
        }
    },
};

const myChart = new Chart(document.getElementById('myChart'), config
);